package PracticalWeek4.CP2406Week4.src.ProgrammingExercises;
import javax.swing.*;

public class CellPhoneService {
    public static void main(String args[]) {
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        int Talk = -1;
        int Texts = -1;
        Double GB = -1.0;
        String PlanA = "Plan A: \nPrice: $49\nBecause you chose: \nminutes: < 500\ntexts: 0\ndata: 0 GB";
        String PlanB = "Plan B: \nPrice: $55\nBecause you chose: \nminutes: < 500\ntexts: infinity";
        String PlanC = "Plan C: \nPrice: $61\nBecause you chose: \nminutes: >= 500\ntexts: < 100\ndata: 0 GB";
        String PlanD = "Plan D: \nprice: $70\nBecause you chose: \ntexts: >= 100";
        String PlanE = "Plan E: \nprice: $79\nBecause you chose: \ndata: < 2 GB";
        String PlanF = "Plan F: \nprice: $87\nBecause you chose: \ndata: >= 2 GB";

        Object[] message = {
                "Input your maximum monthly values: ",
                "\n",
                "Talk minutes used:", field1,
                "Text messages sent:", field2,
                "GB of data used:", field3,
        };
        int option = JOptionPane.showConfirmDialog(null, message,
                "The Cell Phone Service", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {
            String MinutesOfTalk = field1.getText();
            while (Talk < 0 ) {
                try {
                    if (MinutesOfTalk.isEmpty())
                        throw new Exception();
                    Talk = Integer.parseInt(MinutesOfTalk);
                    if (Talk < 0)
                        throw new Exception();
                } catch (Exception e) {
                    MinutesOfTalk = JOptionPane.showInputDialog(null, "Invalid input! \n Maximum talk minutes" +
                            " must be an integer" + " >= 0");
                    if (MinutesOfTalk == null){
                        System.exit(0);
                    }
                }
            }

            String NumberOfTexts = field2.getText();
            while (Texts < 0 ) {
                try {
                    if (NumberOfTexts.isEmpty())
                        throw new Exception();
                    Texts = Integer.parseInt(NumberOfTexts);
                    if (Texts < 0)
                        throw new Exception();
                } catch (Exception e) {
                    NumberOfTexts = JOptionPane.showInputDialog(null, "Invalid input! " +
                            "\n Maximum text messages" + " must be an integer" + " >= 0");
                    if (NumberOfTexts == null){
                        System.exit(0);
                    }
                }
            }

            String AmountOfGB = field3.getText();
            while (GB < 0 ) {
                try {
                    if (AmountOfGB.isEmpty())
                        throw new Exception();
                    GB = Double.parseDouble(AmountOfGB);
                    if (GB < 0)
                        throw new Exception();
                } catch (Exception e) {
                    AmountOfGB = JOptionPane.showInputDialog(null, "Invalid input! " +
                            "\n Maximum GB used" + " must be an integer" + " >= 0");
                    if (AmountOfGB == null){
                        System.exit(0);
                    }
                }
            }

            if (GB >= 2)
                JOptionPane.showMessageDialog(null, "You should choose " + PlanF);
            else if (GB > 0)
                JOptionPane.showMessageDialog(null, "You should choose " + PlanE);
            else if (Texts >= 100)
                JOptionPane.showMessageDialog(null, "You should choose " + PlanD);
            else if (Talk >= 500)
                JOptionPane.showMessageDialog(null, "You should choose " + PlanC);
            else if (Texts > 0)
                JOptionPane.showMessageDialog(null, "You should choose " + PlanB);
            else
                JOptionPane.showMessageDialog(null, "You should choose " + PlanA);


        }
        if (option == JOptionPane.CANCEL_OPTION){
            System.exit(0);
        }





    }

}
