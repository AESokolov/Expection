
public class MyException extends Exception {
	  public void MyException() {
	        System.out.println("There was an exception!!!"); // �������� ����������
	    }
	}
	class Toys {
	    public static short numbers = 0;
	 
	    public static short newNumber() {
	        return ++numbers;
	    }
	 
	    public short number;
	    public String name, size;
	 
	    public void setParam(String name, String size) {
	        try {
	            this.name = name;
	            this.size = size;
	 
	            if (this.number != 0) {
	                throw new MyException(); // ����� ������ �������� ������� MyException
	            }
	 
	            this.number = Toys.newNumber();
	        } catch (MyException e) {
	            System.err.println("Error!");
	            new MyException().MyException();
	        } catch (Exception e) {
	            // ���� ��������� ���� ��������� ���������� ����� try.
	        } finally {
	            System.out.println("Total: \nToy name: " + this.name  // ��� ������
	                    + "\nToy size: " + this.size + "\nNumber of a toy: "   // ������ �������   ����� �������
	                    + this.number);
	        }
	    }
	    public static void main(String[] args) {
	        Toys car = new Toys();
	        try {
	            car.setParam("Car", "Large");
	            // �����-�� �������� ��� �������� car.
	            car.setParam("Car", "Small");
	            // ��� ��� �������� � ������������� �������������� ��������.
	        } catch (Exception e) {
	            // ...
	        }
	    }

}
