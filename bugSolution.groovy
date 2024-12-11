```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return 0 // Return a default value or handle nulls appropriately 
  }
  return a + b // Perform your operation
}

println myMethod(1,2)
println myMethod(null,2)
println myMethod(1,null)
println myMethod(null,null) 
```