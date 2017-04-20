package summer.sample.area;

import cn.hn.java.summer.db.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import summer.sample.area.db.Address;

import java.util.List;

/**
 * Created by xw2sy on 2017-04-16.
 */
@Controller
@RequestMapping("/area")
public class AreaController {
    @Autowired
    BaseDao baseDao;

    @RequestMapping("/getAddresses")
    public List<Address> getAddresses(){
        return baseDao.list(Address.class);
    }

    @RequestMapping("/getAddressesByPage")
    public List<Address> getAddressesByPage(){
        return baseDao.list(Address.class);
    }

    @RequestMapping("/getAddressesSearch")
    public List<Address> getAddressesSearch(Address address){
        return baseDao.list(Address.class,address);
    }

    @GetMapping("/editAddress")
    public Address editAddress(Address address){
        return (Address) baseDao.get(Address.class,address);
    }

    @PostMapping("/editAddress")
    public Address postEditAddress(Address address){
        baseDao.update(address);
        return editAddress(address);
    }

    @GetMapping("/addAddress")
    public void addAddress(Address address){
    }

    @PostMapping("/addAddress")
    public Address postAddAddress(Address address){
        baseDao.insert(address);
        return address;
    }

    @RequestMapping("/delAddress")
    public void delAddress(Address address){
        baseDao.delete(address);
    }

}
