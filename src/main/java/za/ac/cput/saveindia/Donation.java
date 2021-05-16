package za.ac.cput.saveindia;

public class Donation {

    private int donationNumber;
    private String donor;
    private double amountDonated;

    public Donation(int donationNumber, String donor, double amountDonated) {
        this.donationNumber = donationNumber;
        this.donor = donor;
        this.amountDonated = amountDonated;
    }

    public int getDonationNumber() {
        return donationNumber;
    }



    public void setDonationNumber(int donationNumber) {
        this.donationNumber = donationNumber;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public double getAmountDonated() {
        return amountDonated;
    }

    public double getAmountDonated(int donationNumber) {
        double amountDonated = 0.0;
        if(donationNumber == this.getDonationNumber()){
            amountDonated = this.amountDonated;
        }
        return amountDonated;
    }

    public void setAmountDonated(double amountDonated) {
        this.amountDonated = amountDonated;
    }
}
