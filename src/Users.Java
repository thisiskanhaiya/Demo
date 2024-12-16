@Entity
@Table(name = "users")
class Users {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;    
    private String password;   
    private String role;    
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
}

