package banking.gui;

import java.awt.event.ActionEvent;
import javax.swing.*;

import framework.account.AccountType;
import framework.customer.CustomerType;

public class PersonForm extends ACreateAccountForm {
	private static final long serialVersionUID = 1L;
	private JTextField JTextField_BD = new JTextField();
	private JLabel JLabel6 = new JLabel("Birthdate");

	public PersonForm(BankGUI parentframe) {
		super(parentframe);
		setTitle("Add Personal Account");
		setModal(true);
		render();
		setVisible(true);
	}

	@Override
	public void render() {
		super.setView();
		getContentPane().add(JTextField_BD);
		JTextField_BD.setBounds(84, 204, 156, 20);
		getContentPane().add(JLabel6);
		JLabel6.setForeground(java.awt.Color.black);
		JLabel6.setBounds(12, 204, 96, 24);
	}

	@Override
	public void JButtonOK_actionPerformed(ActionEvent event) {
		parentframe.accountnr = JTextField_ACNR.getText();
		parentframe.customerName = JTextField_NAME.getText();
		parentframe.street = JTextField_STR.getText();
		parentframe.city = JTextField_CT.getText();
		parentframe.zip = JTextField_ZIP.getText();
		parentframe.state = JTextField_ST.getText();

		if (JRadioButton_Chk.isSelected()) {
			parentframe.accountType = AccountType.CHECKING;
		} else {
			parentframe.accountType = AccountType.SAVING;
		}
		parentframe.customerType = CustomerType.PERSONAL;
		parentframe.newaccount = true;
		dispose();
		parentframe.fillData();
	}

}
