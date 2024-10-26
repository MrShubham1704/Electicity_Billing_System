package com.demo.ElectrictyBillingSystem.Service;

import java.util.List;

import com.demo.ElectrictyBillingSystem.Entities.Bill;

public interface BillService {
    public List<Bill> getBills();
    public Bill getBill(long billId);
    public Bill addBill(Bill bill);
    public Bill updateBill(Bill bill);
    public void deleteBill(long billId);
}
