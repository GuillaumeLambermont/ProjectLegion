package be.corsac.ProjectLegion.mappers;

import be.corsac.ProjectLegion.models.player.Player;
import be.corsac.ProjectLegion.models.player.playerDTOs.CreatePlayerDTO;
import be.corsac.ProjectLegion.models.player.playerDTOs.PlayerDTO;
import be.corsac.ProjectLegion.models.player.playerDTOs.PlayerIdDTO;

public class PlayerMapper {

    public static Player fromDTO(CreatePlayerDTO createPlayerDTO) {
        return new Player(createPlayerDTO.username(), createPlayerDTO.email());
    }

    public static PlayerDTO toDTO(Player player) {
        return new PlayerDTO(player.getId(), player.getUsername(), player.getEmail());
    }

    public static PlayerIdDTO toIdDTO(Long playerId) {
        return new PlayerIdDTO(playerId);
    }
}
