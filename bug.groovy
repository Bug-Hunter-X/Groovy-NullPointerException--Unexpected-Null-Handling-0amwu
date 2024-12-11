```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // Handle null values explicitly
  }
  // ... rest of the method
}

println myMethod(1,2)
println myMethod(null,2)
println myMethod(1,null)
println myMethod(null,null) 
```