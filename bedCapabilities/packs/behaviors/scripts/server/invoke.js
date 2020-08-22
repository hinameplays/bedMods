var serverSystem = server.registerSystem(0, 0);

function main() {
    findFurnace();
}

function findFurnace() {
    let chatEventData = serverSystem.createEventData("minecraft:display_chat_event");
	chatEventData.data.message = "INVOKED";
    serverSystem.broadcastEvent("minecraft:display_chat_event", chatEventData);
}

export {main};