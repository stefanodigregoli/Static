import java.util.Random;

public class Badge {
    private static int totalNumberOfEmployee = 0;
    private String badgeIdCode;
    private Employee employee;
    private static void keepTrackOfEmployeeNumber(){
        totalNumberOfEmployee++;

    }
    private String  generateBadgeIdCode(String name , String surname){
        String prefix = generateRandomString(3);
        String suffix  = generateRandomString(3);
        return prefix + name + surname + suffix;

    }

    private String generateRandomString(int length){
        String lettere = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i<length; i++){
            char randomChar = lettere.charAt(random.nextInt(lettere.length()));
        }
        return randomString.toString();
    }
    public void showBadgeDetails(){
        System.out.println(" Total number of employee tracked = " + totalNumberOfEmployee);
        employee.getEmployeeDetails();
        System.out.println(badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge){
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode(employeeThatNeedsBadge.getName() , employeeThatNeedsBadge.getSurname());
        keepTrackOfEmployeeNumber();
    }
    
}
