package com.xworkz.gunDetails;

import com.xworkz.gunDetails.dao.GunOperation;
import com.xworkz.gunDetails.dto.BulletDTO;
import com.xworkz.gunDetails.dto.CompanyDTO;
import com.xworkz.gunDetails.dto.GunDetailsDTO;
import com.xworkz.gunDetails.dto.Types;

public class TesterGun {

public static void main(String[] args) {
		
		GunDetailsDTO dto = new GunDetailsDTO();
		dto.setBarrelMaterial("copper");
		dto.setGunName("Rifle");
		dto.setPrice(35000);
		dto.setScope((byte)8);
		dto.setRange(588.65f);
		dto.setTypes(Types.RIFELS);
		
		GunDetailsDTO dto1 = new GunDetailsDTO();
		dto1.setBarrelMaterial("zinc");
		dto1.setGunName("Revolver");
		dto1.setPrice(25000);
		dto1.setScope((byte)4);
		dto1.setRange(288.65f);
		dto1.setTypes(Types.RIFELS);
		
		GunDetailsDTO dto2 = new GunDetailsDTO();
		dto2.setBarrelMaterial("copper");
		dto2.setGunName("Ruger");
		dto2.setPrice(78999);
		dto2.setScope((byte)8);
		dto2.setRange(888.65f);
		dto2.setTypes(Types.DMRS);
		
		GunDetailsDTO dto3 = new GunDetailsDTO();
		dto3.setBarrelMaterial("zinc");
		dto3.setGunName("Blunderbuss");
		dto3.setPrice(76999);
		dto3.setScope((byte)8);
		dto3.setRange(1000.65f);
		dto3.setTypes(Types.BOLTACTION_RIFELS);
		
		BulletDTO bullet = new BulletDTO();
		bullet.setPrice(3200);
		bullet.setWeight((byte)1.2);
		bullet.setComponent("3.5 imp gal");
		
		BulletDTO bullet1 = new BulletDTO();
		bullet1.setPrice(5499);
		bullet1.setWeight((byte)1.4);
		bullet1.setComponent("3.8 imp gal");
		
		BulletDTO bullet2 = new BulletDTO();
		bullet2.setPrice(8700);
		bullet2.setWeight((byte)1.9);
		bullet2.setComponent("6.8 imp gal");
		
		BulletDTO bullet3 = new BulletDTO();
		bullet3.setPrice(9899);
		bullet3.setWeight((byte)3.4);
		bullet3.setComponent("8.0 imp gal");
		
		CompanyDTO company = new CompanyDTO();
		company.setName("India Today");
		company.setContact(636699879);
		company.setFounder("vidya vilas");
		company.setLocation("Uttar Pradesh");
		
		CompanyDTO company1 = new CompanyDTO();
		company.setName("HK");
		company.setContact(907897656);
		company.setFounder("Heckler and Koch");
		company.setLocation("US");
		
		CompanyDTO company2 = new CompanyDTO();
		company.setName("Mossberg");
		company.setContact(985678435);
		company2.setFounder("Frederick Mossberg");
		company.setLocation("US");
		
		CompanyDTO company3 = new CompanyDTO();
		company.setName("Strum");
		company.setContact(636789080);
		company2.setFounder("William B Ruger ");
		company.setLocation("US");
		
		
		dto.setBullet(bullet);
		dto.setCompany(company);
		
		dto1.setBullet(bullet1);
		dto1.setCompany(company1);
		
		dto2.setBullet(bullet2);
		dto2.setCompany(company2);
		
		dto3.setBullet(bullet3);
		dto3.setCompany(company3);
		
		GunOperation operations =new GunOperation();
		operations.save(dto);
		operations.save(dto1);
		operations.save(dto2);
		operations.save(dto3);
		operations.printAll();
		System.out.println();
		System.out.println("get by types--");
		GunDetailsDTO[] res=operations.getAllByTypes(Types.RIFELS);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
			
		}
		System.out.println();
		System.out.println("get by barrelmaterial--");
		GunDetailsDTO[] response=operations.getByBarrelmaterial("copper");
		for (int h = 0; h < response.length; h++) {
			System.out.println(response[h]);
			
		}
		System.out.println();
		System.out.println("update component by name------");
		GunDetailsDTO upd =operations.updateComponentByGunName("copper", "Rifle");
		System.out.println(upd.toString());
		System.out.println();
		System.out.println("update location by name-----");
		GunDetailsDTO upd1 =operations.updateLocationByGunName("Revolver", "US");
		System.out.println(upd1.toString());
		System.out.println();
		System.out.println("get by scope---");
		GunDetailsDTO[] get1=operations.getAllByScope((byte)8);
		for (int k = 0; k < get1.length; k++) {
			System.out.println(get1[k]);
			
		}		System.out.println();
		GunDetailsDTO del =operations.deleteByName("Revolver");
		System.out.println(del);
		System.out.println();
		operations.printAll();
		
		
	}

}
