package android.bignerdranch.navcontrollertest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.navigation_first_fragment, container, false);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button button = view.findViewById(R.id.button_frag1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                // Example using classes generated using SafeArgs plugin
                NavDirections action = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
                Navigation.findNavController(v).navigate(action);
                */

                // Navigation example using ID (strongly recommended to use actions when using IDs to navigate)
                Navigation.findNavController(v).navigate(R.id.action_firstFragment_to_secondFragment);

                // Can also use URIs, not done here
            }
        });
    }
}
