var serverSystem = server.registerSystem(0, 0);

function main() {
    let chatEventData = serverSystem.createEventData("minecraft:display_chat_event");
	chatEventData.data.message = "Registered invoke.main() as handler for submods";
    serverSystem.broadcastEvent("minecraft:display_chat_event", chatEventData);
}


export {main};