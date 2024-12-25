@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
};    

// Напиши код здесь
@Test
public void checkIsAdultWhenAgeIsLessThan18False(){
Program program1 = new Program();
boolean isAdult = program1.checkIsAdult(17); 
assertEquals ("возврат тру на возраст 17", false, isAdult);
};

@Test
public void checkIsAdultWhenAgeIs18True(){
Program program2 = new Program();
boolean isAdult = program2.checkIsAdult(18); 
assertEquals("возврат фолс на возраст 18", true, isAdult);
};
