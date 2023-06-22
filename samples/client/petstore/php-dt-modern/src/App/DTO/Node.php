<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\PhpAttribute as DTA;

/**
 * dummy
 */
class Node
{
    #[DTA\Data(field: "left", nullable: true)]
    #[DTA\Strategy("Object", ["type" => \App\DTO\Node::class])]
    #[DTA\Validator("TypeCompliant", ["type" => \App\DTO\Node::class])]
    public \App\DTO\Node|null $left = null;

    #[DTA\Data(field: "right", nullable: true)]
    #[DTA\Strategy("Object", ["type" => \App\DTO\Node::class])]
    #[DTA\Validator("TypeCompliant", ["type" => \App\DTO\Node::class])]
    public \App\DTO\Node|null $right = null;

}
