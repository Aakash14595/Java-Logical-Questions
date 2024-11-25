package aakash.co.in.customexception;

public class MyCustomExceptionExample extends Exception{

    public static void main(String[] args)  {
        try {
            int age=7;
            validateAge(age);
            System.out.println("age is  "+age);

        }
        catch(MyCustomException e){
            System.out.println("error is "+e);

        }


    }
    public static void validateAge(int age) throws MyCustomException {
        if (age<18)
        {
            throw new MyCustomException("age is less "+age);
        }

    }

}
