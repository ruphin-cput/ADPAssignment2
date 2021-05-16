package za.ac.cput.saveindia;

import java.util.*;


/*
    @Author: 218321392
    Description: Save India - An application that manages donations for India
*/

public class DonationTracker {

    /* Collection Start*/

    //add
    public static int acceptDonationWithCollection(Collection donationList){
        int newCollectionSize;
        return newCollectionSize = donationList.size();
    }

    //Remove
    public static int refuseDonationWithCollection(Collection donationList, Donation donationToDelete)
    {

        int newCollectionSize;
        donationList.remove(donationToDelete);
        return newCollectionSize = donationList.size();
    }

    //Find
    public static double findAmountDonatedWithCollection(Collection donationList, int donationNumberToSearch)
    {
        double amountDonated = 0.0;
        Iterator it = donationList.iterator();
        while(it.hasNext()){
            Donation d = (Donation) it.next();
            int donationNumber = d.getDonationNumber();
            if(donationNumber == donationNumberToSearch){
                amountDonated = d.getAmountDonated(donationNumber);
                break;
            }

        }
        return amountDonated;
    }

    /* Collection End*/

    /* Map Start*/

    //Add
    public static int acceptDonationWithMap(Donation[] donationList, Map<Integer,Donation> map){
        int newMapSize;
        for(int i=0;i<donationList.length;i++){
            map.put(donationList[i].getDonationNumber(),donationList[i]);
        }
        return newMapSize = map.size();
    }
    //Remove
    public static int refuseDonationWithMap(Donation[] donationList, Map<Integer,Donation> map,int itemKeyToDelete){
        int newMapSize;
        for(int i=0;i<donationList.length;i++){
            map.put(donationList[i].getDonationNumber(),donationList[i]);
        }
        map.remove(itemKeyToDelete);
        return newMapSize = map.size();
    }
    //Find
    public static double findAmountDonatedWithMap(Donation[] donationList, Map<Integer,Donation> map,int donationNumber){
        double amountDonated;
        for(int i=0;i<donationList.length;i++){
            map.put(donationList[i].getDonationNumber(),donationList[i]);
        }
        amountDonated = map.get(donationNumber).getAmountDonated();
        return amountDonated;
    }

    /* Map End*/

    /* Set Start*/

    //Add
    public static int acceptDonationWithSet(Set<Donation> donations, ArrayList<Donation> donationList){
        int newSetSize;
        donations.addAll(donationList);
        return newSetSize = donations.size();
    }
    //Remove
    public static int refuseDonationWithSet(Set<Donation> donations, ArrayList<Donation> donationList,
                                            Donation donationToDelete)
    {
        int newSetSize;
        donations.addAll(donationList);
        donations.remove(donationToDelete);
        return newSetSize = donations.size();
    }
    //Find
    public static double findAmountDonatedWithSet(Set<Donation> donations, ArrayList<Donation> donationList,
                                            int donationNumberToSearch)
    {
        double amountDonated = 0.0;
        donations.addAll(donationList);
        Iterator it = donations.iterator();
        for(int i=0;i<donations.size();i++){
            Donation d = (Donation) it.next();
            int donationNumber = d.getDonationNumber();
            if(donationNumber == donationNumberToSearch){
                amountDonated = d.getAmountDonated(donationNumber);
                break;
            }

        }
        return amountDonated;
    }
    /* Set End*/

    /* List Start*/

    //Add
    public static int acceptDonationWithList(List donationList){
        int newSetSize;
        return newSetSize = donationList.size();
    }
    //Remove
    public static int refuseDonationWithList(List donationList,int donationIndexToDelete)
    {
        int newSetSize;
        donationList.remove(donationIndexToDelete);
        return newSetSize = donationList.size();
    }
    //Find
    public static double findAmountDonatedWithList(List donationList,int donationNumberToSearch){
        double amountDonated = 0.0;
        for(int i=0;i<donationList.size();i++){
            Donation d = (Donation) donationList.get(i);
            int donationNumber = d.getDonationNumber();
            if(donationNumber == donationNumberToSearch){
                amountDonated = d.getAmountDonated(donationNumberToSearch);
                break;
            }
        }
        return amountDonated;
    }

    /* List End*/

}
