@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19); //получили число для проверки
    
	// Напиши код здесь
   // boolean actual = isAdult;
    boolean expected = true; // запишет тут результат ожидания от проверки
     assertEquals ("19 не adult", expected, isAdult);
}