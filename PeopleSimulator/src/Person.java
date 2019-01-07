import java.util.ArrayList;


class Person {
	public int age;
	private String name;
    private int birthday;
    private String gender;
    private ArrayList <Integer> haves = new ArrayList <Integer>();
    private ArrayList <Integer> wants = new ArrayList <Integer>();
    private boolean married = false;
    private boolean divorced = false;
    private long identifier = 0;
    private long partner;
	public Person(int age, String name,String gender,int birthdate) {
		this.name = name;
		this.age = age;
        this.birthday = birthdate;
        this.gender = gender;
        this.identifier += 1;
        for(int i = 0; i < 10; i++){
            haves.add((int)(Math.random()*10));
            wants.add((int)(Math.random()*10));
        }
	}

	public boolean olderThan(int otherAge) {
		if (age > otherAge) {
			return true;
		} else {
			return false;
		}

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void hadBirthday() {
		age++;
	}

    public String getGender(){
    return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public ArrayList <Integer> getHaves(){
        return haves;
    }
    public ArrayList <Integer> getWants(){
        return wants;
    }

    public boolean getMarried(){
        return married;
    }

    public void makeMarry(){
        married = true;
    }

    public boolean getDivorced(){
        return divorced;
    }

    public void makeDivorce(){
        divorced = true;
    }

    public void unMarry(){
        married = false;
    }

    public void unDivorce(){
        divorced = false;
    }
    public Long getPartner(){
        return partner;
    }

    public long getIdentifier(){
        return identifier;
    }
    public void setPartner(Person a){
        partner = a.getIdentifier();
    }
}