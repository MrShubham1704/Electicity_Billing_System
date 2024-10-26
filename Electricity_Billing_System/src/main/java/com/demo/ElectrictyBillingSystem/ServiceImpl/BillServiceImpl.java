package com.demo.ElectrictyBillingSystem.ServiceImpl;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.ElectrictyBillingSystem.Entities.Bill;
import com.demo.ElectrictyBillingSystem.Repository.BillRepository;
import com.demo.ElectrictyBillingSystem.Service.BillService;

@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRepository billRepository;

    @Override
    public List<Bill> getBills() {
        return billRepository.findAll();
    }

    @Override
    public Bill getBill(long billId) {
        Optional<Bill> bill = billRepository.findById(billId);
        return bill.orElse(null);
    }

    @Override
    public Bill addBill(Bill bill) {
        return billRepository.save(bill);
    }

    @Override
    public Bill updateBill(Bill bill) {
        if (billRepository.existsById(bill.getBillId())) {
            return billRepository.save(bill);
        }
        return null;
    }

    @Override
    public void deleteBill(long billId) {
        if (billRepository.existsById(billId)) {
            billRepository.deleteById(billId);
        }
    }
}
