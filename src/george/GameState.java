package george;

import java.util.Vector;

public class GameState {
    final public Vector<Tile> tiles;  //The terrain and stuff
    final public Vector<Entity> entities; //Objects that aren't terrain
    final public Player player; //You

    public float dt;
    public float t;

    public GameState() {
        tiles = new Vector<Tile>();
        entities = new Vector<Entity>();
        player = new Player(new Vec2(0.0f, 0.0f));

        dt = 0.0f;
        t = 0.0f;
    }
}
