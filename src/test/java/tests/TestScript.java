package tests;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import configuration.AppInitialization;
import pages.SelectCountry;
import pages.StartShoppingPage;
import pages.NavigationContinuePage;
import pages.HomePage;
import pages.MenuPage;
import pages.SubMenuPage;
import pages.ProductsPage;
import pages.ProductDetailsPage;
import pages.CheckoutPage;

public class TestScript extends AppInitialization{

	private static final Logger log = LogManager.getLogger(TestScript.class.getName());
	AndroidDriver<MobileElement> driver;

	@Test
	public void TestScenario() throws IOException, InterruptedException {
		driver = AppInitialization.InitiateApp();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		SelectCountry country_selection = new SelectCountry();
		country_selection.country_selection(driver, "SelectCountry");
		log.info("Country is Selected");

		SelectCountry btn_continue = new SelectCountry();
		btn_continue.country_selection(driver, "SelectCountry_btn_Continue");
		log.info("Continue Button is Clicked");

		StartShoppingPage btn_strt_shopping = new StartShoppingPage();
		btn_strt_shopping.start_shopping(driver, "StartShopping");
		log.info("Start Shopping is Clicked");

		NavigationContinuePage btn_nav_continue = new NavigationContinuePage();
		btn_nav_continue.navigate(driver, "NavigationContinue");
		log.info("Navigation Continue Button is Clicked");

		HomePage btn_department = new HomePage();
		btn_department.home_page(driver, "DepartmentBtn");
		log.info("Department Button is Clicked");

		MenuPage btn_home_living = new MenuPage();
		btn_home_living.menu_page(driver, "HomeLivingBtn");
		log.info("Home & Living Button is Clicked");

		SubMenuPage btn_home_furniture= new SubMenuPage();
		btn_home_furniture.submenu_page(driver, "HomeFurnitureBtn");
		log.info("Home & Furniture Button is Clicked");

		ProductsPage btn_slecting_product_first = new ProductsPage();
		btn_slecting_product_first.products_page(driver, "SelctFirstListItem");
		log.info("Selecting first Item from products page.");

		ProductDetailsPage btn_add_to_basket= new ProductDetailsPage();
		btn_add_to_basket.product_details_page(driver, "AddToBasketBtn");
		log.info("Product added to Basket");

		CheckoutPage btn_checkout_now = new CheckoutPage();
		btn_checkout_now.checkout_page(driver, "CheckoutNowBtn");
		log.info("Checkout Out Button is Clicked");

		CheckoutPage drd_item_quantity = new CheckoutPage();
		drd_item_quantity.checkout_page(driver, "ItemQuantity_Drd");
		log.info("Item Quantity Dropdown is Clicked");

		CheckoutPage drd_item_quantity_value = new CheckoutPage();
		drd_item_quantity_value.checkout_page(driver, "ItemQuantityValue_Drd");
		log.info("Selecting the Quantity");

		CheckoutPage btn_remove_quantity = new CheckoutPage();
		btn_remove_quantity.checkout_page(driver, "RemoveQuantityBtn");
		log.info("Remove Button is Clicked");	

		CheckoutPage btn_start_shopping = new CheckoutPage();
		btn_start_shopping.checkout_page(driver, "StartShopping_Btn");
		log.info("Start Shopping is Clicked");

	}

	@AfterTest
	public void teardown() {

	}
}
