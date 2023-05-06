/* @provengo summon selenium */


/**
 * This story log in a teacher to moodle site, navigates him to software quality course and then he hides the quiz from students.
 */
story('Hide a quiz by teacher', function () {
  let s = new SeleniumSession().start('http://localhost/login/index.php')
  s.getlogin({ text: 'achiya', text1: 'Aa123456@' })
  s.goToCoursePage()
  s.chooseSQ({ text: 'Software Quality'})
  s.editMode()
  s.settingQuiz()
  try {
    s.clickHide()
  }
  catch(Exception ){

  }
  s.assertHidden({text:'Hidden from students'})
})
/**
 * This story log in a student to moodle site, navigates him to software quality course and then nevigates him to the quiz.
 * Moreover, this story interrupts the above if the ClickHide event takes place by teacher.
 */
story('Student enter quiz',function(){
  let s=new SeleniumSession()
  interrupt(Any({eventName:"ClickHide"}),function(){
    s.start('http://localhost/login/index.php')
    s.getlogin({ text: 'eden', text1: 'Aa123456@' })
    s.goToCoursePage()
    s.chooseSQ({ text: 'Software Quality'})
    s.goToQuiz()
    s.assertOnQuiz({text:'Grading method: Highest grade'})
  })})
