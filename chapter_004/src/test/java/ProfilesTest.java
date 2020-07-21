import org.junit.Test;
import streamAPI.Address;
import streamAPI.Profile;
import streamAPI.Profiles;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {
    @Test
    public void whenListAddress() {
        Address address1 = new Address("Moscow", "Luganskaya", 6, 333);
        Address address2 = new Address("NY", "123", 3, 543);
        List<Profile> input = List.of(
                new Profile(address1),
                new Profile(address2)
        );
        List<Address> rsl = Profiles.collect(input);
        List<Address> expect = List.of(
                new Address("Moscow", "Luganskaya", 6, 333),
                new Address("NY", "123", 3, 543)
        );
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSortedAndUniqueProfiles() {
        Address address1 = new Address("Moscow", "Luganskaya", 6, 333);
        Address address2 = new Address("Moscow", "Luganskaya", 6, 333);
        Address address3 = new Address("NY", "123", 3, 543);
        Address address4 = new Address("NY", "123", 3, 543);
        List<Profile> input = List.of(
                new Profile(address1),
                new Profile(address2),
                new Profile(address3),
                new Profile(address4)
        );
        List<Address> rsl = Profiles.uniqueCollect(input);
        List<Address> expect = List.of(
                new Address("Moscow", "Luganskaya", 6, 333),
                new Address("NY", "123", 3, 543)
        );

        assertThat(rsl, is(expect));
    }
}