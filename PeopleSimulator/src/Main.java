class Main {
	public static void main(String[] args) {
        Society peopleTown = new Society(1000);
         for(int i = 0; i < 1000; i++) {
            peopleTown.cycleDay();
            //Write your print/tests in here if your feature should happen on a dialy basis

            if(!peopleTown.getDisaster().equals("none")){
                int preDisasterPop = peopleTown.population;
                //Shows Disater news report
                System.out.println(peopleTown.getDisaster() + " on " + peopleTown.time.dateToString());
            }
            if(false){
                //Jared and Sophia's Societal Happiness
                System.out.println(" Societal Happiness = " + peopleTown.societalHappiness() +"% on "+ peopleTown.time.dateToString());
            }
        }

        for(Person individual : peopleTown.people){

            //Logan's mating and wedlock methods
            if(individual.getSpouse() != null){
                System.out.println(individual.getName() + " married to " + individual.getSpouse().getName() );
                System.out.println(individual.getSpouse().getName() + " is married to " + individual.getName());
            }
            if(individual.getSpouse() == null && individual.getAge() > 10){
              System.out.println(individual.getName() + " got divorced " + individual.getNumOfTimesDivorced() + " time(s) because their happiness (or sometimes their spouse's) dropped to " + individual.getHappiness());
            }

            //Justin & Drew's income calculated on the bell curve... maybe too many poor people
            System.out.println(individual.getName() + "'s Income: " + individual.income);

            //Fiona's assigning personality numbers based on Dungeouns and Dragons alignments
            System.out.println(individual.getName() + " has personality number " + individual.getPersonalityNumber() + ", called "+ individual.getPersonalityString() + ". " + "isLawful = " + individual.getPersonalityBoolean("isLawful"));
            System.out.println(individual.getName() + " has personality number " + individual.getPersonalityNumber() + ", called "+ individual.getPersonalityString() + ". " + "isLawful = " + individual.getPersonalityBoolean("isLawful"));

        }

        //Miranda's Bank Accounts
        System.out.println(peopleTown.people.get(10).getName() +" Balance = " + peopleTown.people.get(10).acct.getBalance() );        System.out.println(peopleTown.people.get(10).getName() +" Balance = " + peopleTown.people.get(10).acct.getBalance() );

        //Brandon & Ians Places Code Exmaple!
        System.out.println(peopleTown.places.get(0).getClassification());
        //System.out.println(peopleTown.getClassification(peopleTown.places.get(0).getPlace()));
        //remember that there are only 5 towns to start with
        //gets place of each person
        for(int o = 0; o < peopleTown.places.size(); o++){
            //this prints every place name
            System.out.println(peopleTown.places.get(o).getPlace());
        }
        //testing the change place method! This is very powerful
        peopleTown.people.get(1).changePlaceTo("brandontown");
        System.out.println(peopleTown.people.get(1).getPlace());
        //testing the population of method!
        peopleTown.populationOf(peopleTown,"brandontown");
        //Multi-test Of populationOf method!
        System.out.println("Population of place 1" + peopleTown.populationOf(peopleTown,peopleTown.places.get(0).getPlace()));
        System.out.println("Population of place 2" + peopleTown.populationOf(peopleTown,peopleTown.places.get(1).getPlace()));
        System.out.println("Population of place 3" + peopleTown.populationOf(peopleTown,peopleTown.places.get(2).getPlace()));
        System.out.println("Population of place 4" + peopleTown.populationOf(peopleTown,peopleTown.places.get(3).getPlace()));
        System.out.println("Population of place 5" + peopleTown.populationOf(peopleTown,peopleTown.places.get(4).getPlace()));
        //testing the change getClassification
        System.out.println(peopleTown.getClassification(peopleTown.places.get(0).getPlace()));
        //add places methods


    }

}
