package com.inatel.stockmanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inatel.stockmanager.models.Notification;
import com.inatel.stockmanager.models.Stock;

@RestController
public class StockController {
	
	private List<Stock> stocks;
	private List<Notification> notifications;
	
	public StockController() {
		stocks = new ArrayList<Stock>();
		notifications = new ArrayList();
		stocks.add(new Stock("PETR3", "test petr"));
		stocks.add(new Stock("VALE5", "test vale"));
	}
			
	@GetMapping("/stock")
	private List<Stock> getStocks(){
		return stocks;
	}
	
	@PostMapping("/stock")
	private void postStock(@RequestBody Stock stock) {
		if (!isInStockList(stock)) {
			stocks.add(stock);
		}
	}
	
	@PostMapping("/notification")
	private void notification(@RequestBody Notification notification) {
		notifications.add(notification);
	}
	
	private boolean isInStockList(Stock stock) {
		for (int i = 0; i < stocks.size(); i++) {
			if(stocks.get(i).getId().equals(stock.getId())) {
				return true;
			}
		}
		return false;
	}

}
