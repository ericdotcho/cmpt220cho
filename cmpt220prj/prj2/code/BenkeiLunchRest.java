import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class BenkeiLunchRest extends JFrame

{

private Container contents;

private JLabel name, courseNum, welcome, prompt, tuna, salmon, yellowtail, caliRolls, spicyRolls, sodas, beers, waters;

private JLabel chargeDrinks, chargeSubtotal, chargeService, totalBill;

private JTextField numTuna, numSalmon, numYellowtail, numCaliRolls, numSpicyRolls, numSodas, numBeers, numWaters;

private JButton compute;

public BenkeiLunchRest()

{

super("Benkei Sushi Lunch Menu");

contents = getContentPane();
contents.setLayout(new FlowLayout());

name = new JLabel("Programmer: Eric Cho | ");
courseNum = new JLabel("CMPT 220 | ");
welcome = new JLabel("Welcome To Benkei Sushi |");
prompt = new JLabel("Enter number of orders for each product; 0 if none");

tuna = new JLabel("Tuna: $3.00");
tuna.setForeground(Color.BLUE);
numTuna = new JTextField(2);

salmon = new JLabel("Salmon: $2.50");
salmon.setForeground(Color.BLUE);
numSalmon = new JTextField(2);

yellowtail = new JLabel("Yellowtail: $3.50");
yellowtail.setForeground(Color.BLUE);
numYellowtail = new JTextField(2);

caliRolls = new JLabel("California Rolls: $6.50");
caliRolls.setForeground(Color.BLUE);
numCaliRolls = new JTextField(2);

spicyRolls = new JLabel("Spicy Rolls: $8.00");
spicyRolls.setForeground(Color.BLUE);
numSpicyRolls = new JTextField(2);

sodas = new JLabel("Sodas: $2.50");
sodas.setForeground(Color.BLUE);
numSodas = new JTextField(2);

beers = new JLabel("Beers: $3.00");
beers.setForeground(Color.BLUE);
numBeers = new JTextField(2);

waters = new JLabel("Waters: $2.00");
waters.setForeground(Color.BLUE);
numWaters = new JTextField(2);

chargeDrinks = new JLabel("Drinks = $");
chargeSubtotal = new JLabel("Subtotal = $");
chargeService = new JLabel("Service and Taxes(16%) = $");
totalBill= new JLabel("Total Bill = $");

chargeDrinks = new JLabel("Drinks: ?");
chargeSubtotal = new JLabel("Subtotal: ?");
chargeService = new JLabel("Service and Taxes(16%): ?");
totalBill = new JLabel("Total Bill: ?");

compute = new JButton("Calculate Bill");

contents.add(name);
contents.add(courseNum);
contents.add(welcome);
contents.add(prompt);
contents.add(tuna);
contents.add(numTuna);
contents.add(salmon);
contents.add(numSalmon);
contents.add(yellowtail);
contents.add(numYellowtail);
contents.add(caliRolls);
contents.add(numCaliRolls);
contents.add(spicyRolls);
contents.add(numSpicyRolls);
contents.add(sodas);
contents.add(numSodas);
contents.add(beers);
contents.add(numBeers);
contents.add(waters);
contents.add(numWaters);
contents.add(chargeDrinks);
contents.add(chargeSubtotal);
contents.add(chargeService);
contents.add(totalBill);
contents.add(chargeDrinks);
contents.add(chargeSubtotal);
contents.add(chargeService);
contents.add(totalBill);
contents.add(compute);

ButtonHandler bh = new ButtonHandler();

compute.addActionListener(bh);

setSize(750,200);

setVisible(true);

}

private class ButtonHandler implements ActionListener

{

@SuppressWarnings("deprecation")
public void actionPerformed(ActionEvent e) {

try {
double one = Double.parseDouble(numTuna.getText());
double two = Double.parseDouble(numSalmon.getText());
double three = Double.parseDouble(numYellowtail.getText());
double four = Double.parseDouble(numCaliRolls.getText());
double five = Double.parseDouble(numSpicyRolls.getText());
double d1 = Double.parseDouble(numSodas.getText());
double d2 = Double.parseDouble(numBeers.getText());
double d3 = Double.parseDouble(numWaters.getText());

// Calculations for determining total price of bill

double drinks = (d1 * 2.50) + (d2 * 3.00) + (d3 * 2.00);
double orderAmount = ((one * 3.00) + (two * 2.50) + (three * 3.50) + (four * 6.50) + (five * 8.00) + drinks);
double serviceAmount = (orderAmount) * .16;
double totalAmount = (orderAmount + serviceAmount);

// Now to display the charges

chargeDrinks.setText("Drinks: " + new Double(drinks).toString());
chargeSubtotal.setText(" | Subtotal: " + new Double(orderAmount).toString());
chargeService.setText(" | Service and Taxes: " + new Double(serviceAmount).toString());
totalBill.setText(" | Total Bill: " + new Double(totalAmount).toString());

}

catch(NumberFormatException ex)

{

numTuna.setText("Enter Number");

numSalmon.setText("Enter Number");

totalBill.setText("Total: ???");

		}
	}
}

public static void main(String[] args) {

BenkeiLunchRest rest = new BenkeiLunchRest();

rest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}