/* @Provengo summon selenium */

/**
 *  The Getlogin event defines the selenium actions for log in to moodle account.
 */
defineEvent(SeleniumSession, "Getlogin", function(session, e) {
  bp.log.info(e);
  session.writeText("//*[@id=\"username\"]", e.text);
  session.writeText("//*[@id=\"password\"]", e.text1);
  session.click("//*[@id=\"loginbtn\"]");
})
/**
 * The GoToCoursePage event defines the selenium action for clicking the My courses button.
 */
defineEvent(SeleniumSession, "GoToCoursePage", function(session, e) {
    session.click("//*[contains(text(),'My courses') and @role='menuitem']");
})

/**
 * The ChooseSQ event defines the selenium action for clicking the software quality course button".
 */
defineEvent(SeleniumSession, "ChooseSQ", function(session, e) {
    session.click("//*[@class='multiline' and contains(text(),'" + e.text + "')]");
})

/**
 * The GoToQuiz event defines the selenium action for clicking the quiz button".
 */
defineEvent(SeleniumSession, "GoToQuiz", function(session, e) {
    session.click("//*[@id=\"module-2\"]/div/div[1]/div/div[1]/div/div[2]/div[2]/a");
})

/**
 * The EditMode event defines the selenium action for clicking the edit mode button".
 */
defineEvent(SeleniumSession, "EditMode", function(session, e) {
     session.click('/html/body/div[3]/nav/div[2]/form/div/div/input');
})

/**
 * The SettingQuiz event defines the selenium action for clicking the setting button on quiz element".
 */
defineEvent(SeleniumSession, "SettingQuiz", function(session, e) {
     session.click('//*[@id="action-menu-toggle-3"]/i');
})

/**
 * The ClickHide event defines the selenium action for clicking the hide option in setting menu".
 */
defineEvent(SeleniumSession, "ClickHide", function(session, e) {
    session.click('//span[@id="actionmenuaction-10" and contains (text(),"Hide") ]');
})

/**
 * The AssertOnQuiz event defines the selenium action for asserting the student entered the quiz".
 */
defineEvent(SeleniumSession, "AssertOnQuiz", function(session, e) {
    session.assertText('/html/body/div[3]/div[4]/div/div[2]/div/section/div[2]/div[1]/p',e.text);
})

/**
 * The AssertHiddenQuiz event defines the selenium action for asserting the quiz is hidden for students".
 */
defineEvent(SeleniumSession, "AssertHidden", function(session, e) {
    session.assertText('//span[@class="badge badge-pill badge-warning" and contains (text(),"' + e.text + '")]',e.text);

})