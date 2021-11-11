package Assignments.Assignment12;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    List<StudentDetails> stdList;
    public void addStudentsData()
    {
        stdList=new ArrayList<>();
        stdList.add(new StudentDetails(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        stdList.add(new StudentDetails(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        stdList.add(new StudentDetails(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        stdList.add(new StudentDetails(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        stdList.add(new StudentDetails(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        stdList.add(new StudentDetails(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        stdList.add(new StudentDetails(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        stdList.add(new StudentDetails(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        stdList.add(new StudentDetails(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        stdList.add(new StudentDetails(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        stdList.add(new StudentDetails(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        stdList.add(new StudentDetails(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        stdList.add(new StudentDetails(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        stdList.add(new StudentDetails(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        stdList.add(new StudentDetails(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        stdList.add(new StudentDetails(266, "Sanvi Pandey", 17, "Female","Electric", 2019, 72.4));
        stdList.add(new StudentDetails(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }

    void getAllDept(){
        Set<String> set =stdList.stream()
                .map(item -> item.engDepartment)
                .collect(Collectors.toSet());
        System.out.println(set);

    }
    void getDataByEnrolledDate(int date){
        List<String> list = stdList.stream()
                .filter(item -> item.year>date)
                .map(item -> item.name)
                .collect(Collectors.toList());
        System.out.println(list);
    }
    void getStudentByGender(String gender){
        List<String> list = stdList.stream()
                .filter(item -> item.gender.equals(gender))
                .map(item -> item.name)
                .collect(Collectors.toList());
        System.out.println(list);
    }
    long getStudentCountByGender(String gender){
        return stdList.stream()
                .filter(item -> item.gender.equals(gender))
                .count();

    }
    long sumOfAgeByGender(String gender){
        return stdList.stream()
                .filter(item -> item.gender.equals(gender))
                .map(item -> item.age)
                .reduce(0, Integer::sum);
    }
    void getMaxPercentageStudentDetails(){
        StudentDetails student = stdList.stream().max((item1, item2) -> item1.percentage > item2.percentage ? 1 : -1).get();
        System.out.println("name : "+student.name+", percentage : "+student.percentage);
    }
    void getCountByDept(){
        Map<String, Long> map = stdList.stream().collect(Collectors.groupingBy(StudentDetails::getDepartment, Collectors.counting()));
        System.out.println("\n");
        for(Map.Entry<String, Long> e :map.entrySet()){
            System.out.println("dept : "+e.getKey()+", count : "+e.getValue());
        }
    }
    void getAveragePercentageByDept(){
        Map<String, Double> map = stdList.stream().collect(Collectors.groupingBy(StudentDetails::getDepartment, Collectors.averagingDouble(StudentDetails::getPercentage)));
        System.out.println("\n");
        for(Map.Entry<String, Double> e :map.entrySet()){
            System.out.println("dept : "+e.getKey()+", avergae percentage : "+e.getValue());
        }
    }
    void getYoungestDetailsByDeptAndGender(String dept, String gender){
        StudentDetails student =stdList.stream()
                .filter(item -> item.engDepartment.equals(item.engDepartment) && item.gender.equals(gender))
                .min((item1, item2) -> item1.age > item2.age ? 1 : -1).get();
        System.out.println("\n\nname : "+student.name+", age : "+student.age);
    }

    long getStudentCountByDept(String dept){
        return stdList.stream()
                .filter(item -> item.engDepartment.equals(dept) && (item.gender.equals("Male") || item.gender.equals("Female")))
                .count();
    }

    public static void main(String[] args) {
        Main obj =  new Main();
        obj.addStudentsData();

        obj.getAllDept();
        obj.getDataByEnrolledDate(2018);
        obj.getStudentByGender("Male");

        System.out.println("male count : "+obj.getStudentCountByGender("Male")+" female count : "+obj.getStudentCountByGender("Female"));
        System.out.println("Average of both gender ages are : "+(obj.sumOfAgeByGender("Male") + obj.sumOfAgeByGender("Female"))/2.0);

        obj.getMaxPercentageStudentDetails();
        obj.getCountByDept();
        obj.getAveragePercentageByDept();
        obj.getYoungestDetailsByDeptAndGender("Electronic", "Male");

        System.out.println("\nmale and female in computer science dept : "+obj.getStudentCountByDept("Computer Science"));
    }

}
