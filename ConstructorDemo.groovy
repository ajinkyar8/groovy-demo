class Student{
    private String name;
    private int rollNo;
        
    Student(){}
    
    Student(String s, int i){
        name = s;
        rollNo = i;
    }
}

def s = new Student();
s.name = "abc";
s.rollNo = 12;
println s.name;

def s1 = ["def", 13] as Student;
println s1;

def s2 = new Student("ghi", 14);
println s2;

Student s3 = ["jkl", 15]
println s3;

println "if u follow following approach, then there is no need to define a constructor";
def s4 = new Student(name:"mno")