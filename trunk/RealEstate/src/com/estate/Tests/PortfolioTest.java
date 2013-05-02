package com.estate.Tests;

import java.util.ArrayList;
import java.util.List;

import com.estate.Service.PortfolioService;
import com.estate.ServiceImpl.PortfolioServiceImpl;
import com.estate.domain.Address;
import com.estate.domain.KeyBoard;
import com.estate.domain.Portfolio;

public class PortfolioTest {

	public static void main(String[] args) {
		Portfolio portfolio = null;
		int choice = 0;
		int option;
		do {
			System.out.println("[1].CREATE\t\t[2].LIST");
			System.out.println("========================================\n\n");

			option = KeyBoard.readInt("Enter Choice =========>>>> : ");

			switch (option) {
			case 1:
				portfolio = new Portfolio();
				portfolio.setPid(KeyBoard.readString("Enter ID : "));
				portfolio.setPropertyType(KeyBoard
						.readString("Enter PropertyType : "));
				portfolio.setPropertyCategory(KeyBoard
						.readString("Enter PropertyCategory : "));
				portfolio.setAreaSize(KeyBoard.readString("Enter AreaSize : "));

				List<Address> addressList = new ArrayList<Address>();

				Address address1 = new Address();
				address1.setDno(KeyBoard.readString("Enter Dno : "));
				address1.setStreet(KeyBoard.readString("Enter StreetName : "));
				address1.setArea(KeyBoard.readString("Enter AreaName : "));
				address1.setCity(KeyBoard.readString("Enter CityName : "));
				address1.setState(KeyBoard.readString("Enter StateName : "));
				address1.setPinCode(KeyBoard.readString("Enter PinCode : "));
				address1.setpNo(KeyBoard.readString("Enter PhoneNumber : "));

				addressList.add(address1);
				portfolio.setAddressList(addressList);
				PortfolioService portfolioService = new PortfolioServiceImpl();

				portfolioService.create(portfolio);

				System.out.println("====>>Portfolio Record Created<<====");
				break;

			case 2:
				PortfolioService portfolioService2 = new PortfolioServiceImpl();

				List<Portfolio> portfolioList = portfolioService2.getAll();

				for (int i = 0; i < portfolioList.size(); i++) {
					Portfolio portfolio1 = portfolioList.get(i);
					System.out.println(portfolio1.getPid() + "\t"
							+ portfolio1.getPropertyType() + "\t"
							+ portfolio1.getPropertyCategory() + "\t"
							+ portfolio1.getAreaSize());

					List<Address> address2 = portfolio1.getAddressList();
					for (int j = 0; j < address2.size(); j++) {
						Address address = address2.get(j);
						System.out.println(address.getDno() + "\t"
								+ address.getStreet() + "\t"
								+ address.getArea() + "\t" + address.getCity()
								+ "\t" + address.getState() + "\t"
								+ address.getPinCode() + "\t"
								+ address.getpNo());

					}
				}
				break;

			default:
				System.out.println("Enter Valid Choice");
				break;
			}

			choice = KeyBoard.readInt("Do You Want to Continue ? (1/0) : ");
		} while (choice != 0);

	}

}
