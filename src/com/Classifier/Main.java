package com.Classifier;

public class Main {

    public static void main(String[] args) {

        //Create Sample Applicant pool for testing

        //Ideal Candidates
        Student student1 = new Student("Brandon","Schmidt","CA",24,false,2400,33,0.9,"");
        Student student2 = new Student("Margaret","Perkins","IL",24,true,1988,27,0.9,"");
        Student student3 = new Student("Charles","Ryan","TX",42,false,1985,32,0.8,"");
        Student student4 = new Student("lisa","Reed","MA",34,false,1649,26,1.0,"");

        //Mixed Candidates
        Student student5 = new Student("Harold","Adams","LA",20,true,2017,38,0.9,"");
        Student student6 = new Student("Todd","bailey","IL",31,false,1941,16,0.8,"");
        Student student7 = new Student("Kenneth","Lee","NM",38,true,2166,22,0.8,"");
        Student student8 = new Student("Jane","Green","LA",35,false,1963,27,0.7,"");

        //Mixed Candidates
        Student student9 = new Student("Alice","Kim","WV",21,false,1884,29,0.7,"");
        Student student10 = new Student("Thomas","Oliver","CA",69,false,1595,4,0.8,"");
        Student student11 = new Student("Christopher","Black","CA",62,false,2009,31,0.5,"");
        Student student12 = new Student("Frank","Stewart","VA",77,true,1764,22,0.8,"");

        //Rejects
        Student student13 = new Student("Bobby","Lawrence","PA",77,false,2162,48,0.8,"");
        Student student14 = new Student("Antonio","Lawrence","CA",27,false,1930,48,0.5,"");
        Student student15 = new Student("Antonio","Lawrence","CA",27,false,1930,48,0.8,"");
        Student student16 = new Student("Antonio","Lawrence","CA",27,false,1930,48,0.8,"");

        /*Originally I would've loaded the CSV mapping all the test data into POJO's then apply the criteria,
         but for sake of time I am simply loading some hard coded test cases
          */


        //accept phase
        student1.acceptReview(student1);
        student2.acceptReview(student2);
        student3.acceptReview(student3);
        student4.acceptReview(student4);
        student5.acceptReview(student5);
        student6.acceptReview(student6);
        student7.acceptReview(student7);
        student8.acceptReview(student8);
        student9.acceptReview(student9);
        student10.acceptReview(student10);
        student11.acceptReview(student11);
        student12.acceptReview(student12);
        student13.acceptReview(student13);
        student14.acceptReview(student14);
        student15.acceptReview(student15);
        student16.acceptReview(student16);


        //reject phase
        student1.rejectReview(student1);
        student2.rejectReview(student2);
        student3.rejectReview(student3);
        student4.rejectReview(student4);
        student5.rejectReview(student5);
        student6.rejectReview(student6);
        student7.rejectReview(student7);
        student8.rejectReview(student8);
        student9.rejectReview(student9);
        student10.rejectReview(student10);
        student11.rejectReview(student11);
        student12.rejectReview(student12);
        student13.rejectReview(student13);
        student14.rejectReview(student14);
        student15.rejectReview(student15);
        student16.rejectReview(student16);


        //furtherReview phase
        student1.furtherReview(student1);
        student2.furtherReview(student2);
        student3.furtherReview(student3);
        student4.furtherReview(student4);
        student5.furtherReview(student5);
        student6.furtherReview(student6);
        student7.furtherReview(student7);
        student8.furtherReview(student8);
        student9.furtherReview(student9);
        student10.furtherReview(student10);
        student11.furtherReview(student11);
        student12.furtherReview(student12);
        student13.furtherReview(student13);
        student14.furtherReview(student14);
        student15.furtherReview(student15);
        student16.furtherReview(student16);

        //result phase
        System.out.println(student1.getStatus());
        System.out.println(student2.getStatus());
        System.out.println(student3.getStatus());
        System.out.println(student4.getStatus());
        System.out.println("\n");
        System.out.println(student5.getStatus());
        System.out.println(student6.getStatus());
        System.out.println(student7.getStatus());
        System.out.println(student8.getStatus());
        System.out.println("\n");
        System.out.println(student9.getStatus());
        System.out.println(student10.getStatus());
        System.out.println(student11.getStatus());
        System.out.println(student12.getStatus());
        System.out.println("\n");
        System.out.println(student13.getStatus());
        System.out.println(student14.getStatus());
        System.out.println(student15.getStatus());
        System.out.println(student16.getStatus());

    }
}

