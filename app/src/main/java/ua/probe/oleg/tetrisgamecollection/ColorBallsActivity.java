package ua.probe.oleg.tetrisgamecollection;

import android.os.Bundle;

/**
 * Created by oleg on 13.01.17.
 */

public class ColorBallsActivity extends TetrisBaseActivity
{
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    sectionName = "ColorBalls";
    super.onCreate(savedInstanceState);

  }

  @Override
  protected TetrisBase.Controller onGameControllerCreate()
  {
    return new ColorBallsGame.Controller(this);
  }
}
