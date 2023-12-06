# Service
Das Service Object ist dafür zuständig dass Code geschrieben werden kann welcher man mit Test überprüfen kann und für die Datenbank zählt.
### Code Beispiel
``` Java
@Service
@RequiredArgsConstructor
public class AsterixService {
    private final AsterixRepository repo;
    public List<Character> findAll(){
        return  repo.findAll();
    }
}
```
# Controller
Der Controller ist grunsätzlich für Put,Get und Post objekte zuständig Ebenfalls werden die drei Elemente (Service, Controller, Repository ) in sogennante 3 Phasen eingeteilt.
### Code Beispiel
``` Java
    @GetMapping
    List<ApiCharacter> findAll() {
        List<Character> charactersFromDatabase = service.findAll();
        List<ApiCharacter>  charactersToReturn = new ArrayList<>();
        for (Character character : charactersFromDatabase){
            ApiCharacter x = new ApiCharacter(
                    character.id(),
                    character.name(),
                    character.profession(),
                    character.age()
            );
            charactersToReturn.add(x);
        }
        return charactersToReturn;
    }
}
```

# Repository
In dem Repository werden Character oder andere Api daten vordefiniert welche dann im Service Teil abgerufen werden können und so dann auch verwendet werden können
### Code Beispiel
``` Java
public interface AsterixRepository extends MongoRepository<Character, String>{}

```

# Test

Die Test werden dafür verwendet um den Service Teil zuüberprüfen und so zusichergehen ob der code das Gewünschte aussführt 
### Code Beispiel
``` Java
   @Test
    void ifAllCharactersFoundTrue(){
        List<Character> given = Arrays.asList(
                new Character("1", "Asterix", "warrior", 23)
        );

```