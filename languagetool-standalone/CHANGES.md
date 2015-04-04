# LanguageTool Change Log

## 3.0 (release planned for 2015-06-29)

#### Slovak
  * dictionary update and several new rules

#### Embedded server
  * performance improvements for checking small texts
    for the use case that creates a new `JLanguageTool` object
    for every check, as done by the embedded server (or multithreaded
    LT users in general)

#### API
  * several deprecated methods and classes have been removed, e.g.
    * `Language.REAL_LANGUAGES` is now `Languages.get()`
    * `Language.LANGUAGES` is now `Languages.getWithDemoLanguage()` - but you will probably
       want to use `Languages.get()`
  * Other static methods from class Language have also been moved to Languages
  * `PatternToken.getOrGroup()` and `.getAndGroup()` now return an unmodifiable list
  * `AbstractSimpleReplaceRule.getFileName()` has been removed, the class is
    now itself responsible for loading its data
  * Sub classes of `AbstractCompoundRule` are now responsible for loading the
    compound data themselves using `CompoundRuleData`

See [CHANGES.txt](https://github.com/languagetool-org/languagetool/blob/master/languagetool-standalone/CHANGES.txt) for all changes before 3.0