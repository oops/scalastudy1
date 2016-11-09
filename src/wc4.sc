val dogBreeds = List("Doberman", "Yorkshire Terrier", "Dachshund",
  "Scottish Terrier", "Great Dane", "Portuguese Water Dog")
val filteredBreeds = for {
  breed <- dogBreeds
  if breed.contains("Terrier") && !breed.startsWith("Yorkshire")
} yield breed
val filteredBreeds2 = dogBreeds filter (_.contains("Terrier")) filter (!_.startsWith("Yorkshire"))

def containsTerrier(s: String) = s.contains("Terrier") == true
def notStartsWith(s: String) = s.startsWith("Yorkshire") == false
def isEven(n: Int) = (n % 2) == 0

List(1, 2, 3, 4) filter isEven
dogBreeds filter containsTerrier filter notStartsWith foreach println


