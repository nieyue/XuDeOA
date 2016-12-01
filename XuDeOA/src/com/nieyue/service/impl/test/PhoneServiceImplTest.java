package com.nieyue.service.impl.test;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.nieyue.bean.Phone;
import com.nieyue.service.PhoneService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:config/spring-dao.xml","classpath:config/spring-service.xml"})
@TransactionConfiguration(transactionManager="txManager",defaultRollback=false)
public class PhoneServiceImplTest {
	@Resource
	 PhoneService  phoneService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddPhone() {
		Phone p = new Phone();
		p.setType("dsfdsf");
		p.setIemi("sdf2323");
		p.setInventorySituation("sddsssds3333");
		p.setMac("s32323233");
		p.setNumber("sdddddddd32");
		p.setCreateDate(new Date());
		p.setUpdateDate(new Date());
		phoneService.addPhone(p);
	}

	@Test
	public void testDelPhone() {
		phoneService.delPhone(1000);
	}

	@Test
	public void testUpdatePhone() {
		Phone p = phoneService.loadPhone(1000);
		p.setCreateDate(new Date());
		p.setUpdateDate(new Date());
		phoneService.updatePhone(p);
	}

	@Test
	public void testLoadPhone() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountAll() {
		int n = phoneService.countAll();
		System.out.println(n);
	}

	@Test
	public void testLoadPhoneByMac() {
		Phone p = phoneService.loadPhoneByMac("s32323233");
		System.out.println(p.getInventorySituation());
	}

	@Test
	public void testBrowsePagingPhone() {
		List<Phone> l = phoneService.browsePagingPhone(1, 1, "update_date", "desc");
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getMac());
			
		}
	}

}
