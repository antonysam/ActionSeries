# ActionSeries

## Package
```
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
```

## Building a series of Multiple Actions

_series of actions can be done using the action class_

## Syntax
_Instantiating action class_
```
Actions <objectname> = new Actions(driverobj)

// Providing the Actions object name to the Action class
Action seriesofActions = <actionsobj>.moveToElement(webelement)
                                     .click().doubleClick(webelement)
                                     .build;
seriesofActions.perform();
```
