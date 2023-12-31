// Generated by view binder compiler. Do not edit!
package com.example.usingroom.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.usingroom.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUpdateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView ageCard;

  @NonNull
  public final FloatingActionButton btnDelete;

  @NonNull
  public final FloatingActionButton btnSave;

  @NonNull
  public final EditText edtDesc;

  @NonNull
  public final EditText edtTitle;

  @NonNull
  public final CardView nameCard;

  private ActivityUpdateBinding(@NonNull ConstraintLayout rootView, @NonNull CardView ageCard,
      @NonNull FloatingActionButton btnDelete, @NonNull FloatingActionButton btnSave,
      @NonNull EditText edtDesc, @NonNull EditText edtTitle, @NonNull CardView nameCard) {
    this.rootView = rootView;
    this.ageCard = ageCard;
    this.btnDelete = btnDelete;
    this.btnSave = btnSave;
    this.edtDesc = edtDesc;
    this.edtTitle = edtTitle;
    this.nameCard = nameCard;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_update, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ageCard;
      CardView ageCard = ViewBindings.findChildViewById(rootView, id);
      if (ageCard == null) {
        break missingId;
      }

      id = R.id.btnDelete;
      FloatingActionButton btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.btnSave;
      FloatingActionButton btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.edtDesc;
      EditText edtDesc = ViewBindings.findChildViewById(rootView, id);
      if (edtDesc == null) {
        break missingId;
      }

      id = R.id.edtTitle;
      EditText edtTitle = ViewBindings.findChildViewById(rootView, id);
      if (edtTitle == null) {
        break missingId;
      }

      id = R.id.nameCard;
      CardView nameCard = ViewBindings.findChildViewById(rootView, id);
      if (nameCard == null) {
        break missingId;
      }

      return new ActivityUpdateBinding((ConstraintLayout) rootView, ageCard, btnDelete, btnSave,
          edtDesc, edtTitle, nameCard);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
