package data.model;

import java.time.LocalDateTime;
import java.util.List;

public class Package {
    private int id;
    private double weightInGram;
    private User senderDetails;
    private User receiverDetails;
    private LocalDateTime timeCreated;
    private boolean payOnDelivery;
    private List<Event> status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWeightInGram() {
        return weightInGram;
    }

    public void setWeightInGram(double weightInGram) {
        this.weightInGram = weightInGram;
    }

    public User getSenderDetails() {
        return senderDetails;
    }

    public void setSenderDetails(User senderDetails) {
        this.senderDetails = senderDetails;
    }

    public User getReceiverDetails() {
        return receiverDetails;
    }

    public void setReceiverDetails(User receiverDetails) {
        this.receiverDetails = receiverDetails;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public boolean isPayOnDelivery() {
        return payOnDelivery;
    }

    public void setPayOnDelivery(boolean payOnDelivery) {
        this.payOnDelivery = payOnDelivery;
    }

    public List<Event> getStatus() {
        return status;
    }

    public void setStatus(List<Event> status) {
        this.status = status;
    }
}
