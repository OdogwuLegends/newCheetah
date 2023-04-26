package data.repositories;

import data.model.Package;

import java.util.ArrayList;
import java.util.List;

public class PackageRepositoryImpl implements PackageRepository{
    private int lastIdCreated;
    private  List<Package> packages = new ArrayList<>();

    @Override
    public Package save(Package aPackage) {
        boolean isSaved = aPackage.getId() != 0;
        if(isSaved) update(aPackage);

        else saveNewPackage(aPackage);

        return aPackage;
    }

    private void saveNewPackage(Package aPackage) {
        aPackage.setId(generatePackageId());
        packages.add(aPackage);
        lastIdCreated++;
    }


//   private void update(Package aPackage) {
//        Package savedPackage = findById(aPackage.getId());
//        int indexOfSavedPackage = packages.indexOf(savedPackage);
//        packages.set(indexOfSavedPackage, aPackage);
//
//    }
    private void update(Package aPackage){
//            Package savedPackage = findById(aPackage.getId());
//            savedPackage.setWeightInGram(aPackage.getWeightInGram());
//            savedPackage.setPayOnDelivery(aPackage.isPayOnDelivery());
//            savedPackage.setEvents(a);
//
//                    OR

//            Package savedPackage = findById(aPackage.getId());
//            packages.remove(savedPackage);
//            packages.add(aPackage);
                    //OR

        delete(aPackage.getId());
        packages.add(aPackage);
    }

    @Override
    public Package findById(int id){
        for(Package aPackage: packages) if(aPackage.getId() == id)
            return aPackage;

        return null;
//                            OR
//                TRADITIONAL FOR LOOP IN ARRAYLIST

//        for (int i = 0; i < packages.size(); i++) {
//            boolean packageMatches = packages.get(i).getId() == id;
//            if (packageMatches) return packages.get(i);
//        }
//        return null;
    }

    private int generatePackageId(){
        return lastIdCreated +1;
    }

    @Override
    public void delete(Package aPackage) {
        packages.remove(aPackage);

    }

    @Override
    public void delete(int id) {
//        for (Package aPackage: packages) if(aPackage.getId() == id)
//            packages.remove(id);
                    //OR
        Package foundPackage = findById(id);
        delete(foundPackage);
    }

    @Override
    public List<Package> findAll() {
        return null;
    }


    @Override
    public long count() {
        return packages.size();
    }
}
