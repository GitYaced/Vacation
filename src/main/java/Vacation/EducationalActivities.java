package Vacation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class EducationalActivities extends Activities{
    enum subject{history, science, literature};  //an enum or String variable to hold the subject of the activity, such as history, science, or literature
            enum level{beginner, intermediate, advanced}; // an enum or String variable to hold the level of the activity, such as beginner, intermediate, or advanced
}

