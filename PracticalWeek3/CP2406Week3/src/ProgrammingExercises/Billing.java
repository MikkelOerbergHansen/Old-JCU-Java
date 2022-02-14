package ProgrammingExercises;

import javax.swing.JOptionPane;

public class Billing {
    public static void main(String args[])
    {   double Bill;
        String price = JOptionPane.showInputDialog(null, "Enter the price: ",
                JOptionPane.INFORMATION_MESSAGE);
        String quantity = JOptionPane.showInputDialog(null, "Enter the quantity: ",
                JOptionPane.INFORMATION_MESSAGE);
        String couponValue = JOptionPane.showInputDialog(null, "Enter the Value of coupon: ",
                JOptionPane.INFORMATION_MESSAGE);
        Bill = ComputeBill(price);
        JOptionPane.showMessageDialog(null,"The total bill (price + tax) is $" + Bill);
        Bill = ComputeBill(price, quantity);
        JOptionPane.showMessageDialog(null,"The total bill (price*quantity + tax) is $" + Bill);
        Bill = ComputeBill(price, quantity, couponValue);
        JOptionPane.showMessageDialog(null,"The total bill (price*quantity - coupon + tax) is $" + Bill);
    }
    private static double ComputeBill(String price ){
        double Price = Double.parseDouble(price);
        double tax = 0.08;
        return Price + Price * tax;
    }
    private static double ComputeBill(String price, String quantity){
        double Price = Double.parseDouble(price);
        int Quantity = Integer.parseInt(quantity);
        double tax = 0.08;
        return Price * Quantity + Price * Quantity * tax;
    }
    private static double ComputeBill(String price, String quantity, String couponValue){
        double Price = Double.parseDouble(price);
        int Quantity = Integer.parseInt(quantity);
        double CouponValue = Double.parseDouble(couponValue);
        double tax = 0.08;
        return (Price * Quantity - CouponValue) + (Price * Quantity - CouponValue) * tax;
    }
}
