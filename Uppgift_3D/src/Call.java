public class Call {

    private String name;
    private int phone;

    //Default constructor
    public Call () { }

    //All the slots in the array is iterated through, and moved to the left in this method.
    public void Marked (Call [] customerArray) {

        Call print;

        for (int i = 0; i < customerArray.length - 1; i++) {
            //the i index is replaced with the one in front; moving the array objects to the left one by one
            customerArray[i] = customerArray[i + 1];
            //value is stored in print, to check if its null
            print = customerArray[i];
            if (print == null)
            {
                break;
            }
            else {
                System.out.println("Index: " + i + " Name: " + print.getName() + " Number: " + print.getPhone());
            }


        }

    }


    //GETTERS AND SETTERS

    public String getName () {return name;}
    public void setName (String name) {this.name = name;}

    public int getPhone () {return phone;}
    public void setPhone(int phone) {this.phone = phone;}

}
