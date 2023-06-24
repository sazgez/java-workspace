package IrishAssignment;

import javax.swing.JOptionPane;

public class LandscapeProjectApp {

    public static void main(String [] args){
       
        int ChoiceOfUser;
      

        do{
            ChoiceOfUser = ApplicationMenu();
            switch(ChoiceOfUser){

                case 1:
                	JOptionPane.showMessageDialog(null, "Option 1 is selected. Thanks");
                	break;

                case 2:
                	JOptionPane.showMessageDialog(null,"Option 2 is selected. Thanks");
                	break;

                case 3:
                	JOptionPane.showMessageDialog(null,"Option 3 is selected. Thanks");
                	break;

                case 4:
                	JOptionPane.showMessageDialog(null,"Option 4 is selected. Thanks");
                	break;

                case 5:
                	JOptionPane.showMessageDialog(null,"Option 5 is selected. Thanks");
                break;
                
                case 6:
                    JOptionPane.showMessageDialog(null,"Exit done. Thanks");
                    break;

                    default:
                    JOptionPane.showMessageDialog(null,"Invalid entry. Please enter a value between 1-6");
                    break;
                }
            } while (ChoiceOfUser !=6);

        }
            
        public static int ApplicationMenu()
        {
        	int selection;
        	JOptionPane.showMessageDialog(null,"Application Menu - Item Type: Landscape Project" + "\n--------------------------------------------------------------------- " + "\n1 - Add an item"
            + "\n2 - Display the details of the first entered item" + "\n3 - Display the details of the last entered item" + "\n4 - Calculate and display the average value of the mandatory state of all the items entered until that point"
            + "\n5 - Calculate and display the item with the highest mandatory state. " + "\n6 - Exit application");
             
            selection = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a choice: "));
               
            return selection;
      
        }    
    } 

