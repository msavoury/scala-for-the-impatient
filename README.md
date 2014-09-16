learning-scala
=======================

Notes:

In scala console ```:keybindings``` will show all of the keyboard shortcuts

Use the ``javap`` command to see the generated java class

```
$ scalac Car.scala
$ javap -private Car
```

## for loops ##
```
for (i <- expr)
```

When the body of a for loop begins with a **yield** the loop will collect the values from each iteration and return a collection
