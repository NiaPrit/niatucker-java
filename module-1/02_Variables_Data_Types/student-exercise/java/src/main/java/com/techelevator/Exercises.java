package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

		System.out.println("Birds Left: " + remainingNumberOfBirds);

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println("Extra Birds = " + numberOfExtraBirds);
        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int numberOfRaccons = 3;
		int numberOfRacconsGone = 2;
		int numberOfRacconsLeft = numberOfRaccons - numberOfRacconsGone;
		System.out.println("Raccons In The Woods = " + numberOfRacconsLeft);

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int numberOfBeesToFlowers = numberOfFlowers - numberOfBees;
		System.out.println("The Differnce Of Bees to Flowers is = " + numberOfBeesToFlowers);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
	     int numberOfPigeons = 1;
	     int numberOfAddedPigeons = 1;
	     int numberOfPigeonsEating = numberOfPigeons + numberOfAddedPigeons;
	     System.out.println("Total Number of Pigeons = " + numberOfPigeonsEating);
        /*

        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int numberOfOwls = 3;
		int numberOfNewOwls = 2;
		int totalNumberOfOwls = numberOfOwls + numberOfNewOwls;
		System.out.println("Owls On The Fence = " + totalNumberOfOwls);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int workingBeavers = 2;
		int beaversThatWentForSwim = 1;
		int totalNumberOfWorkingBeaver = workingBeavers - beaversThatWentForSwim;
		System.out.println("Total Number Of Working Beavers is = " + totalNumberOfWorkingBeaver);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansOnATreeLimb = 2;
		int moreToucansOnATreeLimb = 1;
		int totalNumberOfToucans = toucansOnATreeLimb + moreToucansOnATreeLimb;
		System.out.println("Toucans In A Tree = " + totalNumberOfToucans);

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int numberOfExtraSquirrels = squirrels - nuts;
		System.out.println("How Many More Squirrels There Are Than Nuts = " + numberOfExtraSquirrels);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = .25;
		double dime = .10;
		double twoNickels = .20;
		double totalMoney = quarter + dime + twoNickels;
		System.out.println("Total Amt of Found Money = " + totalMoney);


        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int briersMuffins = 18;
		int macadamsMuffins = 20;
		int flannerysMuffins = 17;
		int totalFirstGradeMuffins = briersMuffins + macadamsMuffins + flannerysMuffins;
		System.out.println("Total Number of Muffins Baked = " + totalFirstGradeMuffins);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoCost = .24;
		double whistleCost = .14;
		double totalAmtSpent = yoyoCost + whistleCost;
		System.out.println("Amount of Money Spent = " + totalAmtSpent);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmellows = largeMarshmallows + miniMarshmallows;
		System.out.println("Marshmallows Used For 5 Rice Krispies = " + totalMarshmellows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHilts = 29;
		int snowAtBreckknockSchool = 17;
		int differenceInSnowFall = snowAtHilts - snowAtBreckknockSchool;
		System.out.println("Difference in Snow Fall in Inches is = " +differenceInSnowFall);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int moneyMrsHiltHas = 10;
		int moneySpentOnToys = 3 + 2;
		int moneyMrsHiltHasLeft = moneyMrsHiltHas - moneySpentOnToys;
		System.out.println(" Mrs Hilts Money Left Over : " + moneyMrsHiltHasLeft);


		int totalMarbles = 16;
		int marblesLost = 7;
		int marblesLeft = totalMarbles - marblesLost;
		System.out.println("Number of Marbles Left = " + marblesLeft);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int seashellsSheHas = 19;
		int seashellsSheWants = 25;
		int seashellsNeeded = seashellsSheWants - seashellsSheHas;
		System.out.println("Seashells Needed to Complete Collection = " +seashellsNeeded);

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int redAndGreenBallons = 17;
		int redBallons = 8;
		int greenBallons = redAndGreenBallons - redBallons;
		System.out.println("Green Ballons in The Bunch = " + greenBallons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnTheShelf = 38;
		int booksAdded = 10;
		int totalNumberOfBooks = booksOnTheShelf + booksAdded;
		System.out.println("Total Number of Books On The Shelf = " + totalNumberOfBooks);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6;
		int bees = 8;
		int numberOfLegsPerEightBees = beeLegs * bees;
		System.out.println("Number of Legs on 8 Bees are = " + numberOfLegsPerEightBees);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double oneIcecreamCone = .99;
		int iceCreamConesNeeded = 2;
		double costOfTwoCones = oneIcecreamCone * iceCreamConesNeeded;
		System.out.println("Cost of Two IceCream cones is : " + costOfTwoCones);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int rocksNeeded = 125;
		int rocksOnHand= 64;
		int totalRocksNeeded = rocksNeeded - rocksOnHand;
		System.out.println("Rocks Needed For Project is = " + totalRocksNeeded);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int marblesHad = 38;
		int marbleLost = 15;
		int marblesLeftOver = marblesHad - marbleLost;
		System.out.println("Number of Marbles Left = " + marblesLeftOver);


        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		 int milesDriven = 78;
		 int milesDrivenStopped = 32;
		 int milesLeftToDrive = milesDriven - milesDrivenStopped;
		 System.out.println(" Miles Left to Drive : " + milesLeftToDrive);

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
	int morningShovel = 90;
	int afternoonShovel = 45;
	int totalShovelTime = morningShovel + afternoonShovel;
	System.out.println(" Total Time Shoveling is : " + totalShovelTime);
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double costOfHotdog = .50;
		int numberOfHotdogs = 6;
		double moneySpent = numberOfHotdogs * costOfHotdog;
		System.out.println(" Money Spent on Hotdogs : " + moneySpent);

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double moneyMrsHiltHasTotal = .50;
		double pencilCost = .7;
		double totalAmntOfPencils = moneyMrsHiltHasTotal / pencilCost;
		System.out.println("Amnt of Pencils She can Buy : " + totalAmntOfPencils);


        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalNumberOfButterflies = 33;
		int orangeButterflies = 20;
		int numberOfRedButterflies = totalNumberOfButterflies - orangeButterflies;
		System.out.println("Number of Red Butterflies is: " + numberOfRedButterflies);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyKateGave = 1.00;
		double candyCost = .54;
		double changeKateIsGettingBack = moneyKateGave - candyCost;
		System.out.println("Kates Change is: " + changeKateIsGettingBack);

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int treesPlanted = 13;
		int treesWanted = 12;
		int totalTrees = treesPlanted + treesWanted;
		System.out.println("Total Number of Trees in The Backyard: " + totalTrees);
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysUntilJoySeesGma = 2;
		int hoursInOneDay = 24;
		int hoursUntilJoySeesGma = daysUntilJoySeesGma * hoursInOneDay;
		System.out.println("Joy will see Grandma in this many hours : " + hoursUntilJoySeesGma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int cousins = 4;
		int amntOfGumPerCousin = 5;
		int totalAmntOfGumNeeded = cousins * amntOfGumPerCousin;
		System.out.println("Total Amount of Gum Needed for four cousins is: " +totalAmntOfGumNeeded);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double amntOfMoneyDanHas = 3.00;
		double costOfCandyBar = 1.00;
		double moneyLeft = amntOfMoneyDanHas - costOfCandyBar;
		System.out.println("Money Dan Has Leftover is : " + moneyLeft);
       /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boats = 5;
		int peoplePerBoat = 3;
		int totalPeopleOnTheLake = boats * peoplePerBoat;
		System.out.println("The Amount of People on the Lake is : " + totalPeopleOnTheLake);
        /*

        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int legos = 380;
		int leggosLost = 57;
		int totalLeggos = legos - leggosLost;
		System.out.println("Amount of Leggs Ellen has is : " + totalLeggos);
        /*

        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinsWanted = 83;
		int muffinsBaked = 35;
		int muffinsNeeded = muffinsWanted - muffinsBaked;
		System.out.println("Muffins needed to be baked are : " + muffinsNeeded);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int numberOfExtraCrayons = willysCrayons - lucysCrayons;
		System.out.println("Amount of more crayons that Willy has is : " + numberOfExtraCrayons);

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int numberOfStickersOnOnePage = 10;
		int numberOfPages = 22;
		int totalNumberOfStickers = numberOfStickersOnOnePage * numberOfPages;
		System.out.println("Total Number of Stickers Are : " + totalNumberOfStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int numberOfCupcakes = 96;
		int numberOfChildren = 8;
		int cupcakesPerChild = numberOfCupcakes / numberOfChildren;
		System.out.println("Cupcakes Per Child is : " + cupcakesPerChild);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int numberOfGingerBreadCookies = 47;
		int cookiesPerJar = 6;
		int numberOfCookiesPerJar = numberOfGingerBreadCookies / cookiesPerJar;
		System.out.println("Cookies not being placed in a jar is: " + numberOfCookiesPerJar);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissantsPrepped = 59;
		int numberOfNeighbors = 8;
		int croissantsLeftOver = croissantsPrepped % numberOfNeighbors;
		System.out.println("Remainging Crossiant : " + croissantsLeftOver);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int totalOatCookies = 276;
		int cookiesPerTray = 12;
		int traysNeededForCookies = totalOatCookies / cookiesPerTray;
		System.out.println("The Amount of Trays Needed for the cookies are : " + traysNeededForCookies);
		/*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzelsPrepped = 480;
		int servingSize = 12;
		int totalServings = pretzelsPrepped / servingSize;
		System.out.println("Total Serving Sizes per Pretzel Bite : " + totalServings);
     /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?

        */
		int totalCupcakes = 53 - 2;
		int cupcakesPerBox = 3;
		int boxesOf3CupcakesEach = totalCupcakes / cupcakesPerBox;
		System.out.println("Cupcake Boxes with three cupcakes each: " + boxesOf3CupcakesEach);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int totalCarrots = 74;
		int amntOfPeople = 12;
		int carrotsLeftOver = totalCarrots / amntOfPeople;
		System.out.println("Carrots Left Over : " + carrotsLeftOver);

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalNumberOfBears = 98;
		int numberOfBearsOnTheShelves = 7;
		int amntOfShelves = totalNumberOfBears / numberOfBearsOnTheShelves;
		System.out.println("Number Of Bears per Shelves : " + amntOfShelves);
        /*

        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalNumberOfPics = 480;
		int photoAlbum = 20;
		int totalNumberOfAlbumsNeeded = totalNumberOfPics / photoAlbum;
		System.out.println("Number of Albums Needed : " + totalNumberOfAlbumsNeeded);
        /*


        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalNumber = 210;
		int numberOfShelves = 10;
		int booksPerShelves = totalNumber / numberOfShelves;
		System.out.println("Number of Books Per Shelves : " + booksPerShelves);
        /*

        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int totalCroissants = 17;
		int numberOfGuest = 7;
		int croissantsPerGuest = totalCroissants / numberOfGuest;
		System.out.println("Number of Croissants Per Guest : " + croissantsPerGuest);

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
