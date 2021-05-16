package za.ac.cput.saveindia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

/*
    @Author: 218321392
    Description: Save India - An application that manages donations for India
*/

class DonationTrackerTest {

    /*Collection Start*/

    //Add
    @Test
    void testAcceptDonationWithCollection(){
        Collection<Donation> donationList= new ArrayList<Donation>();
        donationList.add(new Donation(101,"Jhon",10000));
        donationList.add(new Donation(102,"Andrew",3000));
        int newListSize = DonationTracker.acceptDonationWithCollection(donationList);
        Assertions.assertEquals(2, newListSize);
    }
    //Remove
    @Test
    void testRefuseDonationWithCollection(){
        Collection<Donation> donationList= new ArrayList<Donation>();
        Donation d1 = new Donation(101,"Jhon",10000);
        Donation d2 = new Donation(102,"Andrew",3000);
        donationList.add(d1);
        donationList.add(d2);
        int newSetSize = DonationTracker.refuseDonationWithCollection(donationList,d1);
        Assertions.assertEquals(1, newSetSize);
    }
    //Find
    @Test
    void testFindAmountDonatedWithCollection(){
        Collection<Donation> donationList= new ArrayList<Donation>();
        donationList.add(new Donation(101,"Jhon",10000));
        donationList.add(new Donation(102,"Andrew",3000));
        double amountDonated = DonationTracker.findAmountDonatedWithCollection(donationList,101);
        Assertions.assertEquals(10000, amountDonated);
    }

    /*Collection End*/

    /*Map Start*/

    //Add
    @Test
    void testAcceptDonationWithMap() {
        Map<Integer,Donation> donations = new HashMap<>();
        Donation[] donationList = new Donation[2] ;
        donationList[0] = new Donation(301,"Bill gates",5000);
        donationList[1] = new Donation(302,"CPUT",2000);
        int newMapSize = DonationTracker.acceptDonationWithMap(donationList,donations);
        Assertions.assertEquals(2, donations.size());

    }
    //Remove
    @Test
    void testRefuseDonationWithMap(){
        Map<Integer,Donation> donations = new HashMap<>();
        Donation[] donationList = new Donation[4] ;
        donationList[0] = new Donation(301,"Bill gates",5000);
        donationList[1] = new Donation(302,"WHO",1000);
        donationList[2] = new Donation(303,"Andrew",4000);
        donationList[3] = new Donation(304,"JP Morgan",1000);
        int newMapSize = DonationTracker.refuseDonationWithMap(donationList,donations,303);
        Assertions.assertEquals(3, donations.size());
    }
    //Find
    @Test
    void testFindAmountDonatedWithMap(){
        Map<Integer,Donation> donations = new HashMap<>();
        Donation[] donationList = new Donation[4] ;
        donationList[0] = new Donation(301,"Bill gates",5000);
        donationList[1] = new Donation(302,"WHO",1000);
        donationList[2] = new Donation(303,"Andrew",4000);
        donationList[3] = new Donation(304,"JP Morgan",1000);
        double amountDonated= DonationTracker.findAmountDonatedWithMap(donationList,donations,301);
        Assertions.assertEquals(5000, amountDonated);
    }
    /*Map End*/

    /*Set Start*/

    //Add
    @Test
    void testAcceptDonationWithSet(){
        Set<Donation> donations = new LinkedHashSet<>();
        ArrayList<Donation> donationList = new ArrayList<Donation>();
        Donation d1 = new Donation(101,"Jhon",10000);
        Donation d2 = new Donation(102,"Andrew",3000);
        donationList.add(d1);
        donationList.add(d2);
        int newSetSize = DonationTracker.acceptDonationWithSet(donations,donationList);
        Assertions.assertEquals(2, newSetSize);
    }
    //Remove
    @Test
    void testRefuseDonationWithSet(){
        Set<Donation> donations = new LinkedHashSet<>();
        ArrayList<Donation> donationList = new ArrayList<Donation>();
        Donation d1 = new Donation(101,"Jhon",10000);
        Donation d2 = new Donation(102,"Andrew",3000);
        donationList.add(d1);
        donationList.add(d2);
        int newSetSize = DonationTracker.refuseDonationWithSet(donations,donationList,d1);
        Assertions.assertEquals(1, newSetSize);
    }
    //Find
    @Test
    void testFindAmountDonatedWithSet(){
        Set<Donation> donations = new LinkedHashSet<>();
        ArrayList<Donation> donationList = new ArrayList<Donation>();
        Donation d1 = new Donation(101,"Jhon",10000);
        Donation d2 = new Donation(102,"Andrew",3000);
        donationList.add(d1);
        donationList.add(d2);
        double amountDonated = DonationTracker.findAmountDonatedWithSet(donations,donationList,102);
        Assertions.assertEquals(3000, amountDonated);
    }

    /*Set End*/

    /*List Start*/

    //Add
    @Test
    void testAcceptDonationWithList(){
        List donationList = new LinkedList();
        donationList.add(new Donation(101,"Jhon",10000));
        donationList.add(new Donation(102,"Andrew",3000));
        int newListSize = DonationTracker.acceptDonationWithList(donationList);
        Assertions.assertEquals(2, newListSize);
    }
    //Remove
    @Test
    void TestRefuseDonationWithList(){
        List donationList = new LinkedList();
        donationList.add(new Donation(101,"Jhon",10000));
        donationList.add(new Donation(102,"Andrew",3000));
        int newListSize = DonationTracker.refuseDonationWithList(donationList,0);
        Assertions.assertEquals(1, newListSize);
    }
    //Find
    @Test
    void testFindAmountDonatedWithList(){
        List donationList = new LinkedList();
        donationList.add(new Donation(101,"Jhon",10000));
        donationList.add(new Donation(102,"Andrew",3000));
        double amountDonated = DonationTracker.findAmountDonatedWithList(donationList,102);
        Assertions.assertEquals(3000, amountDonated);
    }
    /*List End*/


}