
# TP2
## Implicites:
1-new Intent(String action)
  2-Résolvez l'intention avec le système avant d'appeler startActivity() ou startActivityforResult().
    3-Intent takePicture = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
## Cycle de vie et l'état d'activité:
1-Le compteur est réinitialisé à 0, mais le contenu de l'EditText est préservé

   2-Android appelle immédiatement onResume().
   
      3-OnSaveInstanceState() est appelée avant la méthode onResume().
      
          4-onResume() ou onCreate()
# TP3
## PickerForDate:
1-menu_main.xml
2-onOptionsItemSelected(MenuItem item)
3-myAlertBuilder.setTitle("Alert")
4-Dans la méthode onCreateView() de l'extension DialogFragment.
## RecycleView:
1-A RecyclerView is a more resource-efficient way to display scrollable lists.
2-RecyclerView.Adapter
3-View.onClickListener
