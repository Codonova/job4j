package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(p -> p.getAddress()).collect(Collectors.toList());
    }

    public static List<Address> uniqueCollect(List<Profile> profiles) {
        return collect(profiles).stream().distinct().collect(Collectors.toList());
    }
}