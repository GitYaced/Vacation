package Vacation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class ThrillingActivities extends Activities{
    enum intensity{high, medium, low}; //an int or enum variable to hold the level of intensity of the activity, such as high, medium, or low
}

