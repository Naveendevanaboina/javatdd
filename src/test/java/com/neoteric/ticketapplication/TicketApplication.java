package com.neoteric.ticketapplication;

import org.junit.jupiter.api.Test;

public class TicketApplication {
    @Test
    public void test() {
        TicketNew Customer1 = new TicketNew();

        Customer1.firstName = "naveen";
        Customer1.from = "hyd";
        Customer1.amount = 230;
        Customer1.date = "06/07/2024";
        Customer1.phoneNumber = 65468465l;
        System.out.println(Customer1.firstName);
        System.out.println(Customer1.from);
        System.out.println(Customer1.amount);
        System.out.println(Customer1.date);
        System.out.println(Customer1.phoneNumber);
    }
    }
