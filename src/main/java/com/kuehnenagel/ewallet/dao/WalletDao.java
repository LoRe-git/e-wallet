package com.kuehnenagel.ewallet.dao;

import java.sql.SQLException;
import java.util.List;

import com.kuehnenagel.ewallet.model.Wallet;

public interface WalletDao {
	Wallet createWallet(Wallet newWallet) throws SQLException;
	List<Wallet> getWallets()  throws SQLException;
	Wallet getWalletById(Long id);
	Wallet updateWallet(Wallet updatedWallet);
	void saveOrUpdate(List<Wallet> wallets);
}
